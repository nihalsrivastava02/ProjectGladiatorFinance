import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmichartComponent } from './emichart.component';

describe('EmichartComponent', () => {
  let component: EmichartComponent;
  let fixture: ComponentFixture<EmichartComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmichartComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmichartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
