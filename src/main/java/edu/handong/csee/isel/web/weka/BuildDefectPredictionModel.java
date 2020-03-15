package edu.handong.csee.isel.web.weka;
import weka.attributeSelection.BestFirst;
import weka.attributeSelection.CfsSubsetEval;
import weka.attributeSelection.PrincipalComponents;
import weka.attributeSelection.Ranker;
import weka.classifiers.Classifier;
import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.classifiers.functions.SMO;
import weka.classifiers.trees.RandomForest;
import weka.classifiers.functions.Logistic;
import weka.classifiers.trees.J48;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.NaiveBayes;

import weka.core.Instances;
import weka.core.SelectedTag;
import weka.filters.Filter;
import weka.filters.supervised.attribute.AttributeSelection;
import weka.filters.unsupervised.attribute.Remove;

import java.util.Random;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import java.io.FileWriter;
import java.util.Arrays;

import java.util.ArrayList;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class BuildDefectPredictionModel {
	String sourcePath;
	//	String srclabelName;
	//	String srcPosLabelValue;
	String type;
	String csvPath;
	String mlModel;
	String vifThreshold;
	boolean help = false;

	public static void main(String[] args) {

		BuildDefectPredictionModel myRunner = new BuildDefectPredictionModel();
//		myRunner.run(args);
		System.out.println("test execution");

	}
	
}

