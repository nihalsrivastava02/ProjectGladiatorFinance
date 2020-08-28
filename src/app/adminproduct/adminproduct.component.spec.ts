import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminproductComponent } from './adminproduct.component';

describe('ProductComponent', () => {
  let component: AdminproductComponent;
  let fixture: ComponentFixture<AdminproductComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminproductComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminproductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
