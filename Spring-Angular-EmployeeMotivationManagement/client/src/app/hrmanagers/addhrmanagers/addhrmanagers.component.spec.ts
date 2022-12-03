import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddhrmanagersComponent } from './addhrmanagers.component';

describe('AddhrmanagersComponent', () => {
  let component: AddhrmanagersComponent;
  let fixture: ComponentFixture<AddhrmanagersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddhrmanagersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddhrmanagersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
