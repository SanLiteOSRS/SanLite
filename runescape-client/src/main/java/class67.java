import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class class67 {
	@ObfuscatedName("o")
	static final BigInteger field889;
	@ObfuscatedName("q")
	static final BigInteger field888;

	static {
		field889 = new BigInteger("10001", 16); // L: 6
		field888 = new BigInteger("824f2de2a0dd6d85b44b801f7518e6cef7eacec0a14284cbab75c2ac2cf34d2c942efb3604fea616fbf370136562a38ede7136a51e37889c49ab1883910b0296731625bb64164f6f0caf48dc72e22612513ad3576daae73c5c9a1b27d7cbffd7ad60f1de62d8526ce9d17a33ec709e3d620b704d37806701c88b1ddd5057dd5f", 16); // L: 7
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "490839558"
	)
	static boolean method1937(String var0) {
		if (var0 == null) { // L: 65
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 72
			} catch (MalformedURLException var2) { // L: 69
				return false; // L: 70
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lfl;",
		garbageValue = "-2015643594"
	)
	public static Clock method1934() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2090684925"
	)
	static void method1935(int var0) {
		UserComparator6.method2701(14); // L: 1988
		Login.field906 = var0; // L: 1989
	} // L: 1990

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1350013121"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field714 = 0L; // L: 4455
		if (var0 >= 2) { // L: 4456
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4457
		}

		if (MouseRecorder.getWindowedMode() == 1) { // L: 4458
			class329.client.setMaxCanvasSize(765, 503); // L: 4459
		} else {
			class329.client.setMaxCanvasSize(7680, 2160); // L: 4462
		}

		if (Client.gameState >= 25) { // L: 4464
			Calendar.method5510();
		}

	} // L: 4465

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)I",
		garbageValue = "314063878"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex); // L: 12270
		return var1 != null ? var1.integer : var0.flags; // L: 12271 12272
	}
}
