install:
	pip install -r requiriments.txt
pytest:
	python pytest.py test
c_test:
	gcc teste.c -o teste
