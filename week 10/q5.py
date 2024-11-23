'''Write a program in python to find word/s having maximum number of instances in a
   given file and replace all its occurrences with “Aligarh”.    '''





from collections import Counter
import re

def find_and_replace_max_word(file_path):
    with open(file_path, 'r') as file:
        content = file.read()

    words = re.findall(r'\b\w+\b', content.lower())
    
    word_count = Counter(words)

    if word_count:
        max_word, max_count = word_count.most_common(1)[0]
        print(f'Most common word: "{max_word}" with {max_count} occurrences.')

        updated_content = content.replace(max_word, 'Aligarh')

        with open(file_path, 'w') as file:
            file.write(updated_content)
    else:
        print('No words found in the file.')

file_path = r'D:\CAMS-3P01\week 10\file.txt'  
find_and_replace_max_word(file_path)
