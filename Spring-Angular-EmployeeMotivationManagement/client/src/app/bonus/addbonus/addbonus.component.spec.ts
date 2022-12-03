import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddbonusComponent } from './addbonus.component';

describe('AddbonusComponent', () => {
  let component: AddbonusComponent;
  let fixture: ComponentFixture<AddbonusComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddbonusComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddbonusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
