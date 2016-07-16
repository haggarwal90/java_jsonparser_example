package com;
import java.lang.*;
import java.util.Date;
import java.util.List;

import net.minidev.json.JSONArray;

import org.codehaus.jackson.*;

import com.jayway.jsonpath.*;
import com.jayway.jsonpath.internal.filter.*;

public class ParseJson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String jsonString = "{\"delivery_codes\": [{\"postal_code\": {\"district\": \"Ghaziabad\", \"pin\": 201001, \"pre_paid\": \"Y\", \"cash\": \"Y\", \"pickup\": \"Y\", \"repl\": \"N\", \"cod\": \"Y\", \"is_oda\": \"N\", \"sort_code\": \"GB\", \"state_code\": \"UP\"}}]}";
		// String jsonExp = "$.delivery_codes";
		try {

			 String json = "{\"store\": { \"book\": [ { \"category\": \"reference\", \"author\": \"Nigel Rees\", \"title\": \"Sayings of the Century\", \"price\": 8.95 }, { \"category\": \"fiction\", \"author\": \"Evelyn\", \"title\": \"Sword of Honour\", \"price\": 12.99 } ], \"bicycle\": { \"color\": \"red\", \"price\": 19.95 } } }";
			 Filter f = Filter.filter(Criteria.where("author").is("Evelyn"));
			 //Filter ff = JsonNode.class;
			 Filter[] fa = new Filter[1];
			 fa[0] = f;
			 Date d = new Date();
			 long t1 = d.getTime();
			 long l = 1461673840569L;
			 Date d3 = new Date(l);
			 System.out.println(d3);
			 System.out.println(t1);
			 JSONArray  author = (JSONArray) JsonPath.read(json, "$.store.book[?].author", fa);
			 //String author = JsonPath.read(json, "$.store.book[1].author");
			 Date d2= new Date();
			 long t2 = d2.getTime();
			 System.out.println(t2-t1);
			 System.out.println("author is"+author);
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
