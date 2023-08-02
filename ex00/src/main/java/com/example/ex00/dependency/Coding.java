package com.example.ex00.dependency;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Component
@Getter
//@AllArgsConstructor
@RequiredArgsConstructor
public class Coding {
	// �ʵ� ����
	// ������ ���ϰ� ������ �� ������ ��ȯ ����(���� ����)�� ������ �߻����� �ʱ� ������ StackOverFlow �߻�.
	// final�� ���� �� ���� ������ �ٸ� ������ ���� ����
//	@Autowired
//	@NonNull
	private final Computer computer;

	
	// ������ ����
	// ��ȯ ���� �� �����Ϸ��� ���� ����, ���� �߻�
	// �޸𸮿� �Ҵ��ϸ鼭 �ʱⰪ���� ���ԵǹǷ� final Ű���� ��밡��, �ٸ� ������ ���� �Ұ���
	// ������ ������ ���� ������ ��ü�� �������� �����Ƿ�
//	@Autowired
//	public Coding(Computer computer) {
//		super();
//		this.computer = computer;
//	}
	
	
	// Setter ����
	// ������ ���ϰ� ������ �� ������ ��ȯ ����(���� ����)�� ������ �߻����� �ʱ� ������ StackOverFlow �߻�.
	// final�� ���� �� ���� ������ �ٸ� ������ ���� ����
	// �ܺο��� ���� ������ ������.
//	@Autowired
//	public void setComputer(Computer computer) {
//		this.computer = computer;
//	}
}
