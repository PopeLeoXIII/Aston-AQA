import java.util.*;

// TextHandler - класс обработчик текста позволяющий подсчет уникальных слов
public class TextHandler {
    private final String text; // текст с которым будем работать
    private final String[] words; // массив слов в содержащихся в text

    public TextHandler(String text) {
        this.text = text;

        // сначала приведем все к нижнему регистру, что бы из-за заглавных букв не появлялись уникальные слова
        // пробовал использовать .split("\\W+") но работает только с английским и разделяет слова по апострофу
        // в результате в регулярке пробел и список знаков препинания
        words = text.toLowerCase().split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+");
    }

    // listOfUniqueWords - метод для получения списка уникальных слов с информацией о частоте в тексте
    // в результате возвращает список строк, где каждое значение это word=count
    // где word - само слово, count - количество повторений в тексте
    public List<String> listOfUniqueWords() {
        // создадим два списка, где элементы будут показывать сами уникальные слова и сколько раз они встречаются
        ArrayList<String> uniqueWordsList = new ArrayList<>();
        ArrayList<Integer> uniqueWordsCountList = new ArrayList<>();
        for(String word: words) {
            // если слово есть в списке, то оно встречается уже не первый раз
            boolean isContained = uniqueWordsList.contains(word);
            if (isContained) {
                // узнаем под каким индексом его храним и прибавим к счетчику
                int index = uniqueWordsList.indexOf(word);
                uniqueWordsCountList.set(index, uniqueWordsCountList.get(index) + 1);
            } else {
                // иначе добавляем в конец списков
                uniqueWordsList.add(word);
                uniqueWordsCountList.add(1);
            }
        }

        // формируем итоговый список
        List<String> res = new ArrayList<>();
        for (int i = 0; i < uniqueWordsList.size(); i++) {
            res.add(uniqueWordsList.get(i) + "=" + uniqueWordsCountList.get(i));
        }
        return res;
    }

    // listOfUniqueWordsWithMap - метод для получения списка уникальных слов с информацией о частоте в тексте
    // в результате возвращает список строк, где каждое значение это word=count
    // где word - само слово, count - количество повторений в тексте
    public List<String> listOfUniqueWordsWithMap() {
        // тут реализуем все то же самое только с map, будем хранить ключ - само слово,
        // значение - сколько раз уже встретилось
        Map<String, Integer> map = new HashMap<>();
        for(String word: words) {
            // если слово есть в мапе, то оно встречается уже не первый раз
            if (map.containsKey(word)) {
                // увеличим счетчик на 1
                map.replace(word, map.get(word) + 1);
            } else {
                // слово встретилось впервые, добавляем его в map
                map.put(word, 1);
            }
        }

        // просто захотелось посмотреть как элементы из map можно отсортировать
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        // обратный порядок, чтобы самые частые слова были сверху
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // формируем итоговый список
        List<String> res = new ArrayList<>();
        list.forEach(elem -> {
            res.add(elem.getKey() + "=" + elem.getValue());
        });

        return res;
    }

}
