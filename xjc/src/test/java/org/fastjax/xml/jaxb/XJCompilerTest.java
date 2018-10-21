/* Copyright (c) 2018 FastJAX
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * You should have received a copy of The MIT License (MIT) along with this
 * program. If not, see <http://opensource.org/licenses/MIT/>.
 */

package org.fastjax.xml.jaxb;

import java.io.File;
import java.net.URL;
import java.util.LinkedHashSet;

import javax.xml.bind.JAXBException;

import org.fastjax.util.FastCollections;
import org.junit.Test;

public class XJCompilerTest {
  @Test
  public void test() throws JAXBException {
    final XJCompiler.Command command = new XJCompiler.Command();
    command.setSchemas(FastCollections.asCollection(new LinkedHashSet<URL>(), getClass().getResource("/test.xsd")));
    command.setDestDir(new File("target/generated-test-sources/jaxb"));
    command.setExtension(true);
    XJCompiler.compile(command);
  }
}