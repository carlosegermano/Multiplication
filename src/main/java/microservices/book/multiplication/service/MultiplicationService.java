package microservices.book.multiplication.service;

import java.util.List;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {

	Multiplication createRandomMultiplication();
	boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
	
	List<MultiplicationResultAttempt> getStatsForUser(final String userAlias);
}
