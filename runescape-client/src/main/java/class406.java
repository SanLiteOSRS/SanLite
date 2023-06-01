import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class406 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	static final class406 field4550;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	static final class406 field4548;
	@ObfuscatedName("ch")
	static String field4553;
	@ObfuscatedName("ar")
	final String field4549;

	static {
		field4550 = new class406("Basic"); // L: 4
		field4548 = new class406("Bearer"); // L: 5
	}

	class406(String var1) {
		this.field4549 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-872530367"
	)
	String method7614() {
		return this.field4549; // L: 13
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Ltz;",
		garbageValue = "-776793800"
	)
	public static PrivateChatMode method7619(int var0) {
		PrivateChatMode[] var1 = Renderable.method4682(); // L: 20

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 21
			PrivateChatMode var3 = var1[var2]; // L: 22
			if (var0 == var3.field5156) {
				return var3; // L: 24
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "1983255544"
	)
	static boolean method7618(Date var0) {
		Date var1 = method7617(); // L: 1136
		return var0.after(var1); // L: 1137
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "10"
	)
	static Date method7617() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1141
		var0.set(2, 0); // L: 1142
		var0.set(5, 1); // L: 1143
		var0.set(1, 1900); // L: 1144
		return var0.getTime(); // L: 1145
	}
}
