/*
 * The MIT License
 *
 * Copyright 2016 SAInS LLC.
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
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.sainses.psalm.view;

import com.sainses.psalm.ejb.ProjectEJB;
import com.sainses.psalm.ent.Project;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 * View for Projects
 * 
 * @author vvuppala
 */

@Named
@ViewScoped
public class ProjectView implements Serializable {
    private static final Logger logger = Logger.getLogger(ProjectView.class.getName());
    
    @EJB
    private ProjectEJB projectEJB;
    
    private List<Project> projects;
    
    @PostConstruct
    private void init() {
        projects = projectEJB.getAllProjects();
    }
        
    // getters and setters

    public List<Project> getProjects() {
        return projects;
    }
    
}
