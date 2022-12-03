import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TypesnonfinancialmotivationComponent } from './typesnonfinancialmotivation.component';

describe('TypesnonfinancialmotivationComponent', () => {
  let component: TypesnonfinancialmotivationComponent;
  let fixture: ComponentFixture<TypesnonfinancialmotivationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TypesnonfinancialmotivationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TypesnonfinancialmotivationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
