import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Llb;"
	)
	static final PrivateChatMode field3827;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Llb;"
	)
	public static final PrivateChatMode field3824;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Llb;"
	)
	static final PrivateChatMode field3826;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1809257021
	)
	public final int field3825;

	static {
		field3827 = new PrivateChatMode(0);
		field3824 = new PrivateChatMode(1);
		field3826 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field3825 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "250205673"
	)
	static String method6034(int var0) {
		return "<img=" + var0 + ">";
	}
}
