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

@ObfuscatedName("pn")
public class class407 {
	@ObfuscatedName("ab")
	final Map field4556;
	@ObfuscatedName("at")
	final Map field4557;
	@ObfuscatedName("ax")
	final DecimalFormat field4558;

	public class407() {
		this.field4556 = new HashMap(); // L: 12
		this.field4557 = new HashMap(); // L: 13
		this.field4558 = new DecimalFormat(); // L: 14
		this.field4558.setMaximumFractionDigits(2); // L: 17
	} // L: 18

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;S)V",
		garbageValue = "2047"
	)
	public void method7655(HttpsURLConnection var1) {
		Iterator var2 = this.field4556.entrySet().iterator(); // L: 21

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 22
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue()); // L: 24
		}

	} // L: 27

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "2021434067"
	)
	public Map method7622() {
		return this.field4556; // L: 30
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1457887332"
	)
	public void method7623(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 34
			this.field4556.put(var1, var2 != null ? var2 : ""); // L: 35
		}

	} // L: 37

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "33"
	)
	public void method7658(String var1) {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			this.field4556.remove(var1); // L: 41
		}

	} // L: 43

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Ljava/lang/String;I)V",
		garbageValue = "543740428"
	)
	void method7625(class406 var1, String var2) {
		String var3 = String.format("%s %s", var1.method7614(), var2); // L: 46
		this.method7623("Authorization", var3); // L: 47
	} // L: 48

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-14"
	)
	public void method7654(String var1) {
		this.method7625(class406.field4550, var1); // L: 51
	} // L: 52

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "798712701"
	)
	public void method7627(String var1) {
		this.method7625(class406.field4548, var1); // L: 55
	} // L: 56

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lre;B)V",
		garbageValue = "-107"
	)
	public void method7628(class448 var1) {
		this.field4556.put("Content-Type", var1.method8291()); // L: 59
	} // L: 60

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1072250572"
	)
	public void method7629() {
		this.field4556.remove("Content-Type"); // L: 63
	} // L: 64

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "1875035489"
	)
	public void method7630(class448 var1) {
		this.method7638(var1, 1.0F); // L: 67
	} // L: 68

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lre;FB)V",
		garbageValue = "65"
	)
	void method7638(class448 var1, float var2) {
		this.field4557.put(var1, Math.max(0.0F, Math.min(1.0F, var2))); // L: 71
		this.method7632();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "92264616"
	)
	void method7632() {
		this.field4556.remove("Accept");
		if (!this.field4557.isEmpty()) {
			this.field4556.put("Accept", this.method7631());
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1955885874"
	)
	String method7631() {
		ArrayList var1 = new ArrayList(this.field4557.entrySet()); // L: 83
		Collections.sort(var1, new class408(this)); // L: 84
		StringBuilder var2 = new StringBuilder(); // L: 97
		Iterator var3 = var1.iterator(); // L: 98

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 99
			if (var2.length() > 0) { // L: 101
				var2.append(",");
			}

			var2.append(((class448)var4.getKey()).method8291()); // L: 102
			float var5 = (Float)var4.getValue(); // L: 103
			if (var5 < 1.0F) { // L: 104
				String var6 = this.field4558.format((double)var5); // L: 105
				var2.append(";q=").append(var6); // L: 106
			}
		}

		return var2.toString(); // L: 110
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "-230336628"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 72
		if (var1 != null) { // L: 73
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 74
			var1 = new NPCComposition(); // L: 75
			var1.id = var0; // L: 76
			if (var2 != null) { // L: 77
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 78
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 79
			return var1; // L: 80
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "730829517"
	)
	static void method7663() {
		PacketBufferNode var0 = class251.getPacketBufferNode(ClientPacket.field3105, Client.packetWriter.isaacCipher); // L: 4538
		var0.packetBuffer.writeByte(DecorativeObject.getWindowedMode()); // L: 4539
		var0.packetBuffer.writeShort(class10.canvasWidth); // L: 4540
		var0.packetBuffer.writeShort(class11.canvasHeight); // L: 4541
		Client.packetWriter.addNode(var0); // L: 4542
	} // L: 4543
}
