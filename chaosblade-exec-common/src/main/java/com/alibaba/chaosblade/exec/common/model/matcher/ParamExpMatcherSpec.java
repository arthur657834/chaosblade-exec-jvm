package com.alibaba.chaosblade.exec.common.model.matcher;

import com.alibaba.chaosblade.exec.common.aop.PredicateResult;
import com.alibaba.chaosblade.exec.common.constant.ModelConstant;

/** @author lvqi */
public class ParamExpMatcherSpec implements MatcherSpec {

  @Override
  public String getName() {
    return ModelConstant.PARAM_EXP_FLAG;
  }

  @Override
  public String getDesc() {
    return "The method param express match of chaos experiment in effect";
  }

  @Override
  public boolean noArgs() {
    return false;
  }

  @Override
  public boolean required() {
    return false;
  }

  @Override
  public PredicateResult predicate(MatcherModel matcherModel) {
    return PredicateResult.success();
  }
}
