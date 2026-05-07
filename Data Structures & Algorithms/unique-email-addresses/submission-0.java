class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

		for (String email : emails) {
			String localName = email.substring(0, email.indexOf("@"))
					// remove (".") or ("+" followed by any/all characters after it)
					.replaceAll("\\.|\\+.*", "");
			
			String domainName = email.substring(email.indexOf("@"));

			uniqueEmails.add(String.format("%s%s", localName, domainName));
		}

		return uniqueEmails.size();
    }
}