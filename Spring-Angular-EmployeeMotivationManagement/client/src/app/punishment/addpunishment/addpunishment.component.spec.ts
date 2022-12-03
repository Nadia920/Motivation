import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddpunishmentComponent } from './addpunishment.component';

describe('AddpunishmentComponent', () => {
  let component: AddpunishmentComponent;
  let fixture: ComponentFixture<AddpunishmentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddpunishmentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddpunishmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
