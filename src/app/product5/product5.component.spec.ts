import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Product5Component } from './product5.component';

describe('Product5Component', () => {
  let component: Product5Component;
  let fixture: ComponentFixture<Product5Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Product5Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Product5Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
