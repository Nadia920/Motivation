import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SharesComponent } from './share.component';

describe('SharesComponent', () => {
  let component: SharesComponent;
  let fixture: ComponentFixture<SharesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SharesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SharesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
