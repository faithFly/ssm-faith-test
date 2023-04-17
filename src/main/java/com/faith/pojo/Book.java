package com.faith.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public int bookID;
    public String bookName;
    public int bookCounts;
    public String detail;
}
