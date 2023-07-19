import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
public class class419 {
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	static ArchiveDisk field4580;
	@ObfuscatedName("aw")
	final Map field4582;
	@ObfuscatedName("ay")
	final Map field4583;
	@ObfuscatedName("ap")
	final DecimalFormat field4584;

	public class419() {
		this.field4582 = new HashMap(); // L: 12
		this.field4583 = new HashMap(); // L: 13
		this.field4584 = new DecimalFormat(); // L: 14
		this.field4584.setMaximumFractionDigits(2); // L: 17
	} // L: 18

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "-963764392"
	)
	public void method7767(HttpsURLConnection var1) {
		Iterator var2 = this.field4582.entrySet().iterator(); // L: 21

		while (var2.hasNext()) { // L: 26
			Entry var3 = (Entry)var2.next(); // L: 22
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue()); // L: 24
		}

	} // L: 27

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "2099506543"
	)
	public Map method7738() {
		return this.field4582; // L: 30
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1599225833"
	)
	public void method7765(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 34
			this.field4582.put(var1, var2 != null ? var2 : ""); // L: 35
		}

	} // L: 37

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	public void method7740(String var1) {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			this.field4582.remove(var1); // L: 41
		}

	} // L: 43

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqq;Ljava/lang/String;B)V",
		garbageValue = "13"
	)
	void method7752(class418 var1, String var2) {
		String var3 = String.format("%s %s", var1.method7734(), var2); // L: 46
		this.method7765("Authorization", var3); // L: 47
	} // L: 48

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-5"
	)
	public void method7742(String var1) {
		this.method7752(class418.field4577, var1); // L: 51
	} // L: 52

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1164155527"
	)
	public void method7748(String var1) {
		this.method7752(class418.field4576, var1); // L: 55
	} // L: 56

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lra;I)V",
		garbageValue = "1323716650"
	)
	public void method7739(class460 var1) {
		this.field4582.put("Content-Type", var1.method8331()); // L: 59
	} // L: 60

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "18303868"
	)
	public void method7745() {
		this.field4582.remove("Content-Type"); // L: 63
	} // L: 64

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lra;I)V",
		garbageValue = "-1786851185"
	)
	public void method7746(class460 var1) {
		this.method7766(var1, 1.0F); // L: 67
	} // L: 68

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lra;FI)V",
		garbageValue = "1108660685"
	)
	void method7766(class460 var1, float var2) {
		this.field4583.put(var1, Math.max(0.0F, Math.min(1.0F, var2))); // L: 71
		this.method7778(); // L: 72
	} // L: 73

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method7778() {
		this.field4582.remove("Accept"); // L: 76
		if (!this.field4583.isEmpty()) { // L: 77
			this.field4582.put("Accept", this.method7749()); // L: 78
		}

	} // L: 80

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-448426559"
	)
	String method7749() {
		ArrayList var1 = new ArrayList(this.field4583.entrySet()); // L: 83
		Collections.sort(var1, new class420(this)); // L: 84
		StringBuilder var2 = new StringBuilder(); // L: 97
		Iterator var3 = var1.iterator(); // L: 98

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 99
			if (var2.length() > 0) { // L: 101
				var2.append(",");
			}

			var2.append(((class460)var4.getKey()).method8331()); // L: 102
			float var5 = (Float)var4.getValue(); // L: 103
			if (var5 < 1.0F) { // L: 104
				String var6 = this.field4584.format((double)var5); // L: 105
				var2.append(";q=").append(var6); // L: 106
			}
		}

		return var2.toString(); // L: 110
	}
}
