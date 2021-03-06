/*
 * Copyright 2014-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.dts.common.protocol.header;

import io.dts.common.protocol.ResponseMessage;
import io.dts.remoting.CommandCustomHeader;
import io.dts.remoting.annotation.CFNotNull;
import io.dts.remoting.exception.RemotingCommandException;

/**
 * @author liushiming
 * @version BranchCommitResultMessage.java, v 0.0.1 2017年9月4日 下午2:20:45 liushiming
 */
public class BranchCommitResultMessage implements CommandCustomHeader, ResponseMessage {
  /**
   * 事务IDs
   */
  @CFNotNull
  private Long tranId;
  /**
   * 分支IDs
   */
  @CFNotNull
  private Long branchId;

  /**
   * 提交结果
   */
  @CFNotNull
  private int result;


  public Long getTranId() {
    return tranId;
  }

  public void setTranId(Long tranId) {
    this.tranId = tranId;
  }

  public Long getBranchId() {
    return branchId;
  }

  public void setBranchId(Long branchId) {
    this.branchId = branchId;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  @Override
  public void checkFields() throws RemotingCommandException {

  }



}
