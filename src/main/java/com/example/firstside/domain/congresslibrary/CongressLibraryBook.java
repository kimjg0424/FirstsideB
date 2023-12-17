package com.example.firstside.domain.congresslibrary;

import lombok.Getter;

@Getter
public class CongressLibraryBook {

	private String key;

	private String srchTarget;

	private String kwd;

	private int pageNum;

	private int pageSize;

	private String systemType;

	private String category;

	private String lnbTypeName; //  멀티 미디어,장애인 자료

	private String offerDcode2s;//  소장 원문

	private String sort;  //정렬 할 항목

	private String order; // 정렬할 순서 desc,asc

	private String apiType;

	// 원문 이용방법에 대한 정보 예시 :국립중앙도서관 -무료
	private String licYn;

	private String govYn; // 정부간행물


}
