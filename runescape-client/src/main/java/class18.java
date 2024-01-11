import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class18 {
	@ObfuscatedName("wd")
	@ObfuscatedGetter(
		intValue = 567578519
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ao")
	public static ThreadPoolExecutor field85;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		longValue = 2210412390535978497L
	)
	static long field83;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field80;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "[Lnn;"
	)
	static Widget[] field78;
	@ObfuscatedName("am")
	Future field81;
	@ObfuscatedName("ap")
	String field77;

	class18(Future var1) {
		this.field81 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method274(var1); // L: 14
	} // L: 15

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-76"
	)
	void method274(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field77 = var1; // L: 19
		if (this.field81 != null) { // L: 20
			this.field81.cancel(true); // L: 21
			this.field81 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "80"
	)
	public final String method278() {
		return this.field77; // L: 27
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1544046253"
	)
	public boolean method276() {
		return this.field77 != null || this.field81 == null; // L: 31
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-403372870"
	)
	public final boolean method277() {
		return this.method276() ? true : this.field81.isDone(); // L: 35 36
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lab;",
		garbageValue = "52"
	)
	public final class20 method288() {
		if (this.method276()) {
			return new class20(this.field77);
		} else if (!this.method277()) {
			return null; // L: 41
		} else {
			try {
				return (class20)this.field81.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method274(var2); // L: 48
				return new class20(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;",
		garbageValue = "-1149524749"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}
}
