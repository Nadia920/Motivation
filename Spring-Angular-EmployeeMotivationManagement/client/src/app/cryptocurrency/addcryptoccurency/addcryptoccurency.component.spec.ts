import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddcryptoccurencyComponent } from './addcryptoccurency.component';

describe('AddcryptoccurencyComponent', () => {
  let component: AddcryptoccurencyComponent;
  let fixture: ComponentFixture<AddcryptoccurencyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddcryptoccurencyComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddcryptoccurencyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
