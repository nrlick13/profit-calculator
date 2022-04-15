package com.moneymakingcalculator;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class MoneyMakingCalculatorPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(MoneyMakingCalculatorPlugin.class);
		RuneLite.main(args);
	}
}