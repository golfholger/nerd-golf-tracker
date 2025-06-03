package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class HitCountOutput implements Operation {

	private Operation postOperation;

	public HitCountOutput(Operation postOperation) {
		this.postOperation = postOperation;
	}

	@Override
	public String execute(Scorecard scorecard) {
		String hitWord = scorecard.hitCount()>1 ? "hits": "hit";
		String	template ="You got %d %s %s";
		return String.format(template, 
							 scorecard.hitCount(), 
							 hitWord,
							 postOperation.execute(scorecard));
	}
}
