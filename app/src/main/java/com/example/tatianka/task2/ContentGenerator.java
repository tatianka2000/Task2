package com.example.tatianka.task2;

/*
* stub data added; in future version will be refacrored
*
* */

import java.util.ArrayList;
import java.util.List;

public class ContentGenerator {

    private List<Content> mContent;
    private int mCount;

    ContentGenerator() {}

    ContentGenerator(int pageNumber){
        generate(pageNumber);
    }

    public List<Content> getContent(){
        return mContent;
    }

    private void generate(int pageNumber){

        Content.State state;
        switch (pageNumber) {
            case 0:
                // select * from DB where state=INWORK
                state = Content.State.INWORK;
                mCount = 10;
                mContent = new ArrayList<>(mCount);
                mContent.add(new Content("CE-123456", 4, 7, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "вул. Вадима Гетьмана, 42", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                mContent.add(new Content("CE-123456", 0, 6, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.ELEVATOR)));
                mContent.add(new Content("CE-123456", 0, 7, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                mContent.add(new Content("CE-123456", 1, 5, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "Дніпропетровськ", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.BUILDING)));
                mContent.add(new Content("CE-123456", 2, 4, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "вул. Олеся Гончара ,Дніпропетровськ", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.BUILDING)));
                mContent.add(new Content("CE-123456", 3, 3, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.BUILDING)));
                mContent.add(new Content("CE-123456", 0, 4, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                mContent.add(new Content("CE-123456", 0, 5, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "вул. Вадима Гетьмана, 42", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                mContent.add(new Content("CE-123456", 0, 6, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                mContent.add(new Content("CE-123456", 0, 3, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                break;

            case 1:
                // select * from DB where state=WAITING
                state = Content.State.WAITING;
                mCount = 5;
                mContent = new ArrayList<>(mCount);
                mContent.add(new Content("CE-123456", 4, 7, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                mContent.add(new Content("CE-123456", 0, 6, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                mContent.add(new Content("CE-123456", 0, 7, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.ELEVATOR)));
                mContent.add(new Content("CE-123456", 1, 5, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.BUILDING)));
                mContent.add(new Content("CE-123456", 2, 4, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                break;

            case 2:
                // select * from DB where state=WAITING
                state = Content.State.DONE;
                mCount=7;
                mContent = new ArrayList<>(mCount);
                mContent.add(new Content("CE-123456", 4, 7, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                mContent.add(new Content("CE-123456", 0, 6, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                mContent.add(new Content("CE-123456", 0, 7, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.ELEVATOR)));
                mContent.add(new Content("CE-123456", 0, 6, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                mContent.add(new Content("CE-123456", 0, 7, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.BUILDING)));
                mContent.add(new Content("CE-123456", 0, 6, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.MUNICIPAL)));
                mContent.add(new Content("CE-123456", 0, 7, "10 лютого 2016", "10 лютого 2016", "10 лютого 2016", "Відкритий люк (біля рекламного щита), район повороту 18 та 19 трамваїв на проспект Миру з Донецького шоссе", "пр. Мира", "Днепропетровский МВК()", state, new ContentType(ContentType.Type.BUILDING)));
                break;

            default:
                // select * from DB where state=WAITING
                state = Content.State.DONE;
                break;
        }

    }

}
