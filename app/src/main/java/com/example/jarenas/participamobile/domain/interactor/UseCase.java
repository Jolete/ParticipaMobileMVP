package com.example.jarenas.participamobile.domain.interactor;

import com.example.jarenas.participamobile.domain.executor.PostExecutionThread;
import com.example.jarenas.participamobile.domain.executor.ThreadExecutor;

/**
 * Created by jarenas on 25/11/2015.
 *
 * Abstract class for a Use Case (Interactor in terms of Clean Architecture).
 * This interface represents a execution unit for different use cases (this means any use case
 * in the application should implement this contract).
 *
 * By convention each UseCase implementation will return the result using a {@link //rx.Subscriber}
 * that will execute its job in a background thread and will post the result in the UI thread.
 */

public abstract class UseCase {
    private final ThreadExecutor threadExecutor;
    private final PostExecutionThread postExecutionThread;


    protected UseCase(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread) {
        this.threadExecutor = threadExecutor;
        this.postExecutionThread = postExecutionThread;
    }

    /**
     * Executes the current use case.
     *
     * @param //UseCaseSubscriber The guy who will be listen to the observable build with {@link //#buildUseCaseObservable()}.
     */
    @SuppressWarnings("unchecked")
    public void execute(/*Subscriber UseCaseSubscriber*/) {
        /*this.subscription = this.buildUseCaseObservable()
                .subscribeOn(Schedulers.from(threadExecutor))
                .observeOn(postExecutionThread.getScheduler())
                .subscribe(UseCaseSubscriber);*/
    }

    /**
     * Unsubscribes from current {@link //rx.Subscription}.
     */
    public void unsubscribe() {
        /*if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }*/
    }


}
