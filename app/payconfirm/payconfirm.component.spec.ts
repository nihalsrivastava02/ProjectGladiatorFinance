import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PayconfirmComponent } from './payconfirm.component';

describe('PayconfirmComponent', () => {
  let component: PayconfirmComponent;
  let fixture: ComponentFixture<PayconfirmComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PayconfirmComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PayconfirmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
