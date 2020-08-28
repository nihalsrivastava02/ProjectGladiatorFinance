import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Product6Component } from './product6.component';

describe('Product6Component', () => {
  let component: Product6Component;
  let fixture: ComponentFixture<Product6Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Product6Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Product6Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
