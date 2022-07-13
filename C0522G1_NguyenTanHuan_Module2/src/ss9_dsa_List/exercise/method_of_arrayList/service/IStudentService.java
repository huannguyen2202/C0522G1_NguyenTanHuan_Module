package ss9_dsa_List.exercise.method_of_arrayList.service;

import ss9_dsa_List.exercise.method_of_arrayList.service.impl.StudentService;

public interface IStudentService {
    int size();

    void clear();

    void add(Object elements, int index);

    boolean add(Object elements);

    int indexOf(Object element);

    boolean contains(Object elenment);

    Object remove(int index);

    StudentService<Object> clone();

    Object get(int index);

    void ensureCapacity(int minCapacity);

    void findAll();
}
