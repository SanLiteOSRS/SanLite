import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
public class class387 {
	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("s")
	final Map field4504;
	@ObfuscatedName("z")
	final Map field4506;
	@ObfuscatedName("j")
	final DecimalFormat field4508;

	public class387() {
		this.field4504 = new HashMap(); // L: 12
		this.field4506 = new HashMap(); // L: 13
		this.field4508 = new DecimalFormat(); // L: 14
		this.field4508.setMaximumFractionDigits(2); // L: 17
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "-1049286397"
	)
	public void method7415(HttpsURLConnection var1) {
		Iterator var2 = this.field4504.entrySet().iterator(); // L: 21

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 22
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue()); // L: 24
		}

	} // L: 27

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "76"
	)
	public Map method7416() {
		return this.field4504; // L: 30
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2075850159"
	)
	public void method7453(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 34
			this.field4504.put(var1, var2 != null ? var2 : ""); // L: 35
		}

	} // L: 37

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1705839977"
	)
	public void method7418(String var1) {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			this.field4504.remove(var1); // L: 41
		}

	} // L: 43

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnb;Ljava/lang/String;I)V",
		garbageValue = "2014207131"
	)
	void method7447(class386 var1, String var2) {
		String var3 = String.format("%s %s", var1.method7408(), var2); // L: 46
		this.method7453("Authorization", var3); // L: 47
	} // L: 48

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1740379753"
	)
	public void method7442(String var1) {
		this.method7447(class386.field4499, var1); // L: 51
	} // L: 52

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1920346440"
	)
	public void method7445(String var1) {
		this.method7447(class386.field4498, var1); // L: 55
	} // L: 56

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpf;I)V",
		garbageValue = "2146860138"
	)
	public void method7422(class427 var1) {
		this.field4504.put("Content-Type", var1.method8031()); // L: 59
	} // L: 60

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-22923"
	)
	public void method7423() {
		this.field4504.remove("Content-Type"); // L: 63
	} // L: 64

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpf;I)V",
		garbageValue = "-8448203"
	)
	public void method7424(class427 var1) {
		this.method7425(var1, 1.0F); // L: 67
	} // L: 68

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpf;FI)V",
		garbageValue = "238428991"
	)
	void method7425(class427 var1, float var2) {
		this.field4506.put(var1, Math.max(0.0F, Math.min(1.0F, var2))); // L: 71
		this.method7441(); // L: 72
	} // L: 73

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1684584540"
	)
	void method7441() {
		this.field4504.remove("Accept"); // L: 76
		if (!this.field4506.isEmpty()) { // L: 77
			this.field4504.put("Accept", this.method7427()); // L: 78
		}

	} // L: 80

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "588749880"
	)
	String method7427() {
		ArrayList var1 = new ArrayList(this.field4506.entrySet()); // L: 83
		Collections.sort(var1, new class388(this)); // L: 84
		StringBuilder var2 = new StringBuilder(); // L: 97
		Iterator var3 = var1.iterator(); // L: 98

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 99
			if (var2.length() > 0) { // L: 101
				var2.append(",");
			}

			var2.append(((class427)var4.getKey()).method8031()); // L: 102
			float var5 = (Float)var4.getValue(); // L: 103
			if (var5 < 1.0F) { // L: 104
				String var6 = this.field4508.format((double)var5); // L: 105
				var2.append(";q=").append(var6); // L: 106
			}
		}

		return var2.toString(); // L: 110
	}
}
