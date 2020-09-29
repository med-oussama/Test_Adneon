package com.adneom.test.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartitionServiceImpl implements PartitionService {

    @Override
    public List<List<Character>> partition1(List<Character> list, int taille) {

        if (taille <= 0 || list == null || list.isEmpty()) {
            return null;
        }
        List<List<Character>> result = new ArrayList<>();

        if (taille >= list.size()) {
            result.add(list);
            return result;
        }

        int resultSize = list.size() % taille == 0 ? list.size() / taille : list.size() / taille +1;
        int pas =0 ;
        for (int i = 0; i < resultSize; i++) {
            List<Character> chars = new ArrayList<>();
            list.stream().skip(pas).limit(taille).forEach(chars::add);
            result.add(chars);
            pas+=taille;
        }
        return result;
    }

    @Override
    public List<List<Character>> partition2(List<Character> list, int taille) {

        if (taille <= 0 || list == null || list.isEmpty()) {
            return null;
        }
        List<List<Character>> result = new ArrayList<>();

        if (taille >= list.size()) {
            result.add(list);
            return result;
        }
        int i = 0;
        int j = 0;
        while (j < list.size()) {
            List<Character> chars = new ArrayList<>();
            while (i < taille && j < list.size()) {
                chars.add(list.get(j));
                i++;
                j++;
            }
            result.add(chars);
            i = 0;

        }
        return result;
    }
}
