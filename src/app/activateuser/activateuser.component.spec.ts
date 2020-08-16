import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ActivateuserComponent } from './activateuser.component';

describe('ActivateuserComponent', () => {
  let component: ActivateuserComponent;
  let fixture: ComponentFixture<ActivateuserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ActivateuserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ActivateuserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
