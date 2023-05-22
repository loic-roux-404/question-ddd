import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpHeaders, HttpResponse } from '@angular/common/http';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ActivatedRoute } from '@angular/router';
import { RouterTestingModule } from '@angular/router/testing';
import { of } from 'rxjs';

import { ResourceAcceptedAssociationEventService } from '../service/resource-accepted-association-event.service';

import { ResourceAcceptedAssociationEventComponent } from './resource-accepted-association-event.component';

describe('ResourceAcceptedAssociationEvent Management Component', () => {
  let comp: ResourceAcceptedAssociationEventComponent;
  let fixture: ComponentFixture<ResourceAcceptedAssociationEventComponent>;
  let service: ResourceAcceptedAssociationEventService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule.withRoutes([
          { path: 'resource-accepted-association-event', component: ResourceAcceptedAssociationEventComponent },
        ]),
        HttpClientTestingModule,
      ],
      declarations: [ResourceAcceptedAssociationEventComponent],
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
      .overrideTemplate(ResourceAcceptedAssociationEventComponent, '')
      .compileComponents();

    fixture = TestBed.createComponent(ResourceAcceptedAssociationEventComponent);
    comp = fixture.componentInstance;
    service = TestBed.inject(ResourceAcceptedAssociationEventService);

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
    expect(comp.resourceAcceptedAssociationEvents?.[0]).toEqual(expect.objectContaining({ id: 123 }));
  });

  describe('trackId', () => {
    it('Should forward to resourceAcceptedAssociationEventService', () => {
      const entity = { id: 123 };
      jest.spyOn(service, 'getResourceAcceptedAssociationEventIdentifier');
      const id = comp.trackId(0, entity);
      expect(service.getResourceAcceptedAssociationEventIdentifier).toHaveBeenCalledWith(entity);
      expect(id).toBe(entity.id);
    });
  });
});
