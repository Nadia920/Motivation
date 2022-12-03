import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TypesfinancialmotivationComponent } from './typesfinancialmotivation.component';

describe('TypesfinancialmotivationComponent', () => {
  let component: TypesfinancialmotivationComponent;
  let fixture: ComponentFixture<TypesfinancialmotivationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TypesfinancialmotivationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TypesfinancialmotivationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
