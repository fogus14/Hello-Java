package com.fogus14.tutorial.generic;

import com.fogus14.tutorial.generic.animal.Animal;

// 제한된 타입 파라미터
public class DoraemonRestrictPocket<T extends Animal> {
    // 범위 == Animal과 Animal을 상속받은 클래스들
    // Animal, Dog, Cat, Rabbit

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



}
