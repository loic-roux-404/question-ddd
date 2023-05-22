import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpHeaders, HttpResponse } from '@angular/common/http';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ActivatedRoute } from '@angular/router';
import { RouterTestingModule } from '@angular/router/testing';
import { of } from 'rxjs';

import { ResourceWaitingForAssociationEventService } from '../service/resource-waiting-for-association-event.service';

import { ResourceWaitingForAssociationEventComponent } from './resource-waiting-for-association-event.component';

describe('ResourceWaitingForAssociationEvent Management Component', () => {
  let comp: ResourceWaitingForAssociationEventComponent;
  let fixture: ComponentFixture<ResourceWaitingForAssociationEventComponent>;
  let service: ResourceWaitingForAssociationEventService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule.withRoutes([
          { path: 'resource-waiting-for-association-event', component: ResourceWaitingForAssociationEventComponent },
        ]),
        HttpClientTestingModule,
      ],
      declarations: [ResourceWaitingForAssociationEventComponent],
      providers: [
        {
          provide: ActivatedRoute,
          useValue: {
            data: of({
              defaultSort: 'id,asc',
            }),
            queryParamMap: of(
              jest.requireActual('@angular/router').convertToParamMap({
                page: '1',
                size: '1',
                sort: 'id,desc',
              })
            ),
            snapshot: { queryParams: {} },
          },
        },
      ],
    })
      .overrideTemplate(ResourceWaitingForAssociationEventComponent, '')
      .compileComponents();

    fixture = TestBed.createComponent(ResourceWaitingForAssociationEventComponent);
    comp = fixture.componentInstance;
    service = TestBed.inject(ResourceWaitingForAssociationEventService);

    const headers = new HttpHeaders();
    jest.spyOn(service, 'query').mockReturnValue(
      of(
        new HttpResponse({
          body: [{ id: 123 }],
          headers,
        })
      )
    );
  });

  it('Should call load all on init', () => {
    // WHEN
    comp.ngOnInit();

    // THEN
    expect(service.query).toHaveBeenCalled();
    expect(comp.resourceWaitingForAssociationEvents?.[0]).toEqual(expect.objectContaining({ id: 123 }));
  });

  describe('trackId', () => {
    it('Should forward to resourceWaitingForAssociationEventService', () => {
      const entity = { id: 123 };
      jest.spyOn(service, 'getResourceWaitingForAssociationEventIdentifier');
      const id = comp.trackId(0, entity);
      expect(service.getResourceWaitingForAssociationEventIdentifier).toHaveBeenCalledWith(entity);
      expect(id).toBe(entity.id);
    });
  });
});
