package ru.forxy.patterns.behavioral.visitor;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 20:23
 * To change this template use File | Settings | File Templates.
 */
public class DoVisitor implements Visitor<Element> {

    public void visit(Element element) {
        System.out.println("Do something with : " + element.getName());
    }
}
