import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';

import { IQuestionSentTagId } from '../question-sent-tag-id.model';
import { sampleWithRequiredData, sampleWithNewData, sampleWithPartialData, sampleWithFullData } from '../question-sent-tag-id.test-samples';

import { QuestionSentTagIdService } from './question-sent-tag-id.service';

const requireRestSample: IQuestionSentTagId = {
  ...sampleWithRequiredData,
};

describe('QuestionSentTagId Service', () => {
  let service: QuestionSentTagIdService;
  let httpMock: HttpTestingController;
  let expectedResult: IQuestionSentTagId | IQuestionSentTagId[] | boolean | null;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
    });
    expectedResult = null;
    service = TestBed.inject(QuestionSentTagIdService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  describe('Service methods', () => {
    it('should find an element', () => {
      const returnedFromService = { ...requireRestSample };
      const expected = { ...sampleWithRequiredData };

      service.find(123).subscribe(resp => (expectedResult = resp.body));

      const req = httpMock.expectOne({ method: 'GET' });
      req.flush(returnedFromService);
      expect(expectedResult).toMatchObject(expected);
    });

    it('should return a list of QuestionSentTagId', () => {
      const returnedFromService = { ...requireRestSample };

      const expected = { ...sampleWithRequiredData };

      service.query().subscribe(resp => (expectedResult = resp.body));

      const req = httpMock.expectOne({ method: 'GET' });
      req.flush([returnedFromService]);
      httpMock.verify();
      expect(expectedResult).toMatchObject([expected]);
    });

    describe('addQuestionSentTagIdToCollectionIfMissing', () => {
      it('should add a QuestionSentTagId to an empty array', () => {
        const questionSentTagId: IQuestionSentTagId = sampleWithRequiredData;
        expectedResult = service.addQuestionSentTagIdToCollectionIfMissing([], questionSentTagId);
        expect(expectedResult).toHaveLength(1);
        expect(expectedResult).toContain(questionSentTagId);
      });

      it('should not add a QuestionSentTagId to an array that contains it', () => {
        const questionSentTagId: IQuestionSentTagId = sampleWithRequiredData;
        const questionSentTagIdCollection: IQuestionSentTagId[] = [
          {
            ...questionSentTagId,
          },
          sampleWithPartialData,
        ];
        expectedResult = service.addQuestionSentTagIdToCollectionIfMissing(questionSentTagIdCollection, questionSentTagId);
        expect(expectedResult).toHaveLength(2);
      });

      it("should add a QuestionSentTagId to an array that doesn't contain it", () => {
        const questionSentTagId: IQuestionSentTagId = sampleWithRequiredData;
        const questionSentTagIdCollection: IQuestionSentTagId[] = [sampleWithPartialData];
        expectedResult = service.addQuestionSentTagIdToCollectionIfMissing(questionSentTagIdCollection, questionSentTagId);
        expect(expectedResult).toHaveLength(2);
        expect(expectedResult).toContain(questionSentTagId);
      });

      it('should add only unique QuestionSentTagId to an array', () => {
        const questionSentTagIdArray: IQuestionSentTagId[] = [sampleWithRequiredData, sampleWithPartialData, sampleWithFullData];
        const questionSentTagIdCollection: IQuestionSentTagId[] = [sampleWithRequiredData];
        expectedResult = service.addQuestionSentTagIdToCollectionIfMissing(questionSentTagIdCollection, ...questionSentTagIdArray);
        expect(expectedResult).toHaveLength(3);
      });

      it('should accept varargs', () => {
        const questionSentTagId: IQuestionSentTagId = sampleWithRequiredData;
        const questionSentTagId2: IQuestionSentTagId = sampleWithPartialData;
        expectedResult = service.addQuestionSentTagIdToCollectionIfMissing([], questionSentTagId, questionSentTagId2);
        expect(expectedResult).toHaveLength(2);
        expect(expectedResult).toContain(questionSentTagId);
        expect(expectedResult).toContain(questionSentTagId2);
      });

      it('should accept null and undefined values', () => {
        const questionSentTagId: IQuestionSentTagId = sampleWithRequiredData;
        expectedResult = service.addQuestionSentTagIdToCollectionIfMissing([], null, questionSentTagId, undefined);
        expect(expectedResult).toHaveLength(1);
        expect(expectedResult).toContain(questionSentTagId);
      });

      it('should return initial array if no QuestionSentTagId is added', () => {
        const questionSentTagIdCollection: IQuestionSentTagId[] = [sampleWithRequiredData];
        expectedResult = service.addQuestionSentTagIdToCollectionIfMissing(questionSentTagIdCollection, undefined, null);
        expect(expectedResult).toEqual(questionSentTagIdCollection);
      });
    });

    describe('compareQuestionSentTagId', () => {
      it('Should return true if both entities are null', () => {
        const entity1 = null;
        const entity2 = null;

        const compareResult = service.compareQuestionSentTagId(entity1, entity2);

        expect(compareResult).toEqual(true);
      });

      it('Should return false if one entity is null', () => {
        const entity1 = { id: 123 };
        const entity2 = null;

        const compareResult1 = service.compareQuestionSentTagId(entity1, entity2);
        const compareResult2 = service.compareQuestionSentTagId(entity2, entity1);

        expect(compareResult1).toEqual(false);
        expect(compareResult2).toEqual(false);
      });

      it('Should return false if primaryKey differs', () => {
        const entity1 = { id: 123 };
        const entity2 = { id: 456 };

        const compareResult1 = service.compareQuestionSentTagId(entity1, entity2);
        const compareResult2 = service.compareQuestionSentTagId(entity2, entity1);

        expect(compareResult1).toEqual(false);
        expect(compareResult2).toEqual(false);
      });

      it('Should return false if primaryKey matches', () => {
        const entity1 = { id: 123 };
        const entity2 = { id: 123 };

        const compareResult1 = service.compareQuestionSentTagId(entity1, entity2);
        const compareResult2 = service.compareQuestionSentTagId(entity2, entity1);

        expect(compareResult1).toEqual(true);
        expect(compareResult2).toEqual(true);
      });
    });
  });

  afterEach(() => {
    httpMock.verify();
  });
});
