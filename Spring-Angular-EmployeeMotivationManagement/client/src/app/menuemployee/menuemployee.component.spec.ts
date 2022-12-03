import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuemployeeComponent } from './menuemployee.component';

describe('MenuemployeeComponent', () => {
  let component: MenuemployeeComponent;
  let fixture: ComponentFixture<MenuemployeeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MenuemployeeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MenuemployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
