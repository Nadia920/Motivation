import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddsharesComponent } from './addshares.component';

describe('AddsharesComponent', () => {
  let component: AddsharesComponent;
  let fixture: ComponentFixture<AddsharesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddsharesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddsharesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
