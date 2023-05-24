import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class9 implements class356 {
	@ObfuscatedName("wf")
	static List field35;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	public static final class9 field45;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	public static final class9 field39;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	static final class9 field36;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	static final class9 field37;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	static final class9 field46;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2043788763
	)
	static int field44;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1555915261
	)
	static int field43;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 985819831
	)
	int field34;
	@ObfuscatedName("aq")
	String field40;
	@ObfuscatedName("al")
	boolean field41;
	@ObfuscatedName("at")
	boolean field42;

	static {
		field45 = new class9(0, "POST", true, true); // L: 6
		field39 = new class9(1, "GET", true, false); // L: 7
		field36 = new class9(2, "PUT", false, true); // L: 8
		field37 = new class9(3, "PATCH", false, true); // L: 9
		field46 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field34 = var1; // L: 17
		this.field40 = var2; // L: 18
		this.field41 = var3; // L: 19
		this.field42 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field34; // L: 37
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "74"
	)
	boolean method77() {
		return this.field41; // L: 24
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-57"
	)
	public String method71() {
		return this.field40; // L: 28
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "142097256"
	)
	boolean method72() {
		return this.field42; // L: 32
	}
}
