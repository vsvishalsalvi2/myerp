/**
 * 
 */
package myerp.controller;

import com.opensymphony.xwork2.ActionSupport;

import myerp.util.AppConstants;

/**
 * @author Vishal Salvi
 *
 */
public class InitialController extends ActionSupport 
{
private static final long serialVersionUID = 4264717065233764024L;

	public String execute() 
	{
		return AppConstants.SUCCESS;
	}
}
