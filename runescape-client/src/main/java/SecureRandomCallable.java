import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("x")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -276676703
	)
	@Export("menuX")
	static int menuX;

	SecureRandomCallable() {
	}

	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lni;B)I",
		garbageValue = "1"
	)
	static final int method2052(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field4229) {
			case 2:
				return 20;
			default:
				return 12;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "924721389"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "76"
	)
	public static int method2047(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1971468049"
	)
	static final void method2051(int var0, int var1, int var2, boolean var3) {
		if (class174.loadInterface(var0)) {
			WorldMapLabelSize.resizeInterface(WorldMapSection1.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
