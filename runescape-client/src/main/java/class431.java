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

@ObfuscatedName("qf")
public class class431 {
	@ObfuscatedName("ao")
	final Map field4637;
	@ObfuscatedName("ab")
	final Map field4638;
	@ObfuscatedName("au")
	final DecimalFormat field4640;

	public class431() {
		this.field4637 = new HashMap(); // L: 12
		this.field4638 = new HashMap(); // L: 13
		this.field4640 = new DecimalFormat(); // L: 14
		this.field4640.setMaximumFractionDigits(2); // L: 17
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "514712825"
	)
	public void method7958(HttpsURLConnection var1) {
		Iterator var2 = this.field4637.entrySet().iterator(); // L: 21

		while (var2.hasNext()) { // L: 26
			Entry var3 = (Entry)var2.next(); // L: 22
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue()); // L: 24
		}

	} // L: 27

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "289317846"
	)
	public Map method7953() {
		return this.field4637; // L: 30
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1068565867"
	)
	public void method7954(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 34
			this.field4637.put(var1, var2 != null ? var2 : ""); // L: 35
		}

	} // L: 37

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "90"
	)
	public void method7955(String var1) {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			this.field4637.remove(var1); // L: 41
		}

	} // L: 43

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqr;Ljava/lang/String;I)V",
		garbageValue = "-1582767971"
	)
	void method7976(class430 var1, String var2) {
		String var3 = String.format("%s %s", var1.method7948(), var2); // L: 46
		this.method7954("Authorization", var3); // L: 47
	} // L: 48

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "1431"
	)
	public void method7957(String var1) {
		this.method7976(class430.field4634, var1); // L: 51
	} // L: 52

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1155653800"
	)
	public void method7977(String var1) {
		this.method7976(class430.field4633, var1); // L: 55
	} // L: 56

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)V",
		garbageValue = "-85"
	)
	public void method7981(class472 var1) {
		this.field4637.put("Content-Type", var1.method8563()); // L: 59
	} // L: 60

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	public void method7960() {
		this.field4637.remove("Content-Type"); // L: 63
	} // L: 64

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)V",
		garbageValue = "4"
	)
	public void method7961(class472 var1) {
		this.method7962(var1, 1.0F); // L: 67
	} // L: 68

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsi;FI)V",
		garbageValue = "-974878647"
	)
	void method7962(class472 var1, float var2) {
		this.field4638.put(var1, Math.max(0.0F, Math.min(1.0F, var2))); // L: 71
		this.method7963(); // L: 72
	} // L: 73

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1694240959"
	)
	void method7963() {
		this.field4637.remove("Accept"); // L: 76
		if (!this.field4638.isEmpty()) { // L: 77
			this.field4637.put("Accept", this.method7964()); // L: 78
		}

	} // L: 80

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1880009483"
	)
	String method7964() {
		ArrayList var1 = new ArrayList(this.field4638.entrySet()); // L: 83
		Collections.sort(var1, new class432(this)); // L: 84
		StringBuilder var2 = new StringBuilder(); // L: 97
		Iterator var3 = var1.iterator(); // L: 98

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 99
			if (var2.length() > 0) { // L: 101
				var2.append(",");
			}

			var2.append(((class472)var4.getKey()).method8563()); // L: 102
			float var5 = (Float)var4.getValue(); // L: 103
			if (var5 < 1.0F) { // L: 104
				String var6 = this.field4640.format((double)var5); // L: 105
				var2.append(";q=").append(var6); // L: 106
			}
		}

		return var2.toString(); // L: 110
	}
}
