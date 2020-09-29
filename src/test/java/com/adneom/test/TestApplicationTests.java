package com.adneom.test;

import com.adneom.test.Services.PartitionService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class TestApplicationTests {

    @Autowired
    PartitionService partitionService;

    private List<Character> list = new ArrayList<>(Arrays.asList('1', '2', '3', '4', '5'));


    @Test
    void Test_ListNull() {
        List<List<Character>> res = partitionService.partition1(null, 2);
        Assert.assertNull(res);

    }

    @Test
    void Test_taille_0() {
        List<List<Character>> res = partitionService.partition1(list, 0);
        Assert.assertNull(res);

    }

    @Test
    void Test_ListVide() {
        List<List<Character>> res = partitionService.partition1(new ArrayList<>(), 3);
        Assert.assertNull(res);

    }

    @Test
    void Test_1_List_remplit_taille() {
        List<List<Character>> res = partitionService.partition1(list, 2);
        Assert.assertEquals(3,res.size());
        Assert.assertEquals(2,res.get(0).size());
        Assert.assertEquals(
                new ArrayList<>(Arrays.asList(
                        new ArrayList<>(Arrays.asList('1', '2')),
                        new ArrayList<>(Arrays.asList('3', '4')),
                        new ArrayList<>(Arrays.asList('5')))
                ),res);

    }

    @Test
    void Test_2_List_remplit_taille() {
        List<List<Character>> res = partitionService.partition1(list, 3);
        Assert.assertEquals(2,res.size());
        Assert.assertEquals(3,res.get(0).size());
        Assert.assertEquals(
                new ArrayList<>(Arrays.asList(
                        new ArrayList<>(Arrays.asList('1', '2', '3')),
                        new ArrayList<>(Arrays.asList('4', '5')))
                ),res);

    }

    @Test
    void Test_3_List_remplit_taille() {
        List<List<Character>> res = partitionService.partition1(list, 1);
        Assert.assertEquals(5,res.size());
        Assert.assertEquals(1,res.get(0).size());
        Assert.assertEquals(
                new ArrayList<>(Arrays.asList(
                        new ArrayList<>(Arrays.asList('1')),
                        new ArrayList<>(Arrays.asList('2')),
                        new ArrayList<>(Arrays.asList('3')),
                        new ArrayList<>(Arrays.asList('4')),
                        new ArrayList<>(Arrays.asList('5'))
                )),res);

    }



    @Test
    void Test_1_List_remplit_taille_methode_2() {
        List<List<Character>> res = partitionService.partition2(list, 2);
        Assert.assertEquals(3,res.size());
        Assert.assertEquals(2,res.get(0).size());
        Assert.assertEquals(
                new ArrayList<>(Arrays.asList(
                        new ArrayList<>(Arrays.asList('1', '2')),
                        new ArrayList<>(Arrays.asList('3', '4')),
                        new ArrayList<>(Arrays.asList('5')))
                ),res);

    }

    @Test
    void Test_2_List_remplit_taille_methode_2() {
        List<List<Character>> res = partitionService.partition2(list, 3);
        Assert.assertEquals(2,res.size());
        Assert.assertEquals(3,res.get(0).size());
        Assert.assertEquals(
                new ArrayList<>(Arrays.asList(
                        new ArrayList<>(Arrays.asList('1', '2', '3')),
                        new ArrayList<>(Arrays.asList('4', '5')))
                ),res);

    }

    @Test
    void Test_3_List_remplit_taille_methode_2() {
        List<List<Character>> res = partitionService.partition2(list, 1);
        Assert.assertEquals(5,res.size());
        Assert.assertEquals(1,res.get(0).size());
        Assert.assertEquals(
                new ArrayList<>(Arrays.asList(
                        new ArrayList<>(Arrays.asList('1')),
                        new ArrayList<>(Arrays.asList('2')),
                        new ArrayList<>(Arrays.asList('3')),
                        new ArrayList<>(Arrays.asList('4')),
                        new ArrayList<>(Arrays.asList('5'))
                )),res);

    }

}
