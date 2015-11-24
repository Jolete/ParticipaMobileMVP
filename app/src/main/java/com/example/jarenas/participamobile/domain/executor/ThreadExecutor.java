package com.example.jarenas.participamobile.domain.executor;

import java.util.concurrent.Executor;

/**
 * Created by jarenas on 24/11/2015.
 *
 * Executor implementation can be based on different frameworks or techniques of asynchronous
 * execution, but every implementation will execute the
 * {@link com.example.jarenas.participamobile.domain.interactor.UseCase} out of the UI thread.
 */

public interface ThreadExecutor extends Executor {


}
