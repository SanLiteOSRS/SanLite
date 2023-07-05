import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("en")
public class class112 extends UrlRequester {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -455411853
	)
	static int field1400;
	@ObfuscatedName("ds")
	static boolean field1401;
	@ObfuscatedName("ax")
	final boolean field1402;

	public class112(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1402 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "2051535253"
	)
	void vmethod2824(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19
		boolean var9 = false;

		HttpURLConnection var12;
		label139: {
			label131: {
				try {
					label134: {
						var9 = true; // L: 21
						String var3 = var1.field1407.getProtocol(); // L: 22
						if (var3.equals("http")) {
							var2 = this.method2825(var1); // L: 23
						} else {
							if (!var3.equals("https")) { // L: 25
								var1.field1403 = UrlRequest.field1405; // L: 29
								var9 = false;
								break label134;
							}

							var2 = this.method2823(var1); // L: 26
						}

						this.method2803(var2, var1); // L: 32
						var9 = false;
						break label139;
					}
				} catch (IOException var10) { // L: 34
					var1.field1403 = UrlRequest.field1405; // L: 35
					var9 = false;
					break label131;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) { // L: 39
					HttpURLConnection var4 = (HttpURLConnection)var2; // L: 40
					var4.disconnect(); // L: 41
				}

				return; // L: 30
			}

			if (var2 != null && var2 instanceof HttpURLConnection) { // L: 38
				var12 = (HttpURLConnection)var2;
				var12.disconnect();
			}

			return; // L: 45
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			var12 = (HttpURLConnection)var2;
			var12.disconnect();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Let;B)Ljava/net/URLConnection;",
		garbageValue = "-96"
	)
	URLConnection method2825(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1407.openConnection(); // L: 48
		this.method2802(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Let;I)Ljava/net/URLConnection;",
		garbageValue = "-988635270"
	)
	URLConnection method2823(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1407.openConnection(); // L: 54
		if (!this.field1402) { // L: 55
			var2.setSSLSocketFactory(class15.method206()); // L: 56
		}

		this.method2802(var2); // L: 58
		return var2; // L: 59
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "69"
	)
	static int method2828(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1589
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1606
				var7 = var2 ? class53.scriptDotWidget : Interpreter.field864; // L: 1607
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1608
				if (var4 >= 1 && var4 <= 10) { // L: 1609
					class101 var8 = new class101(var4, var7.id, var7.childIndex, var7.itemId); // L: 1612
					Interpreter.field873.add(var8); // L: 1613
					return 1; // L: 1614
				} else {
					throw new RuntimeException(); // L: 1610
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1616
				Interpreter.Interpreter_intStackSize -= 3; // L: 1617
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1618
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1619
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1620
				if (var5 >= 1 && var5 <= 10) { // L: 1621
					class101 var6 = new class101(var5, var3, var4, FriendSystem.getWidget(var3).itemId); // L: 1624
					Interpreter.field873.add(var6); // L: 1625
					return 1; // L: 1626
				} else {
					throw new RuntimeException(); // L: 1622
				}
			} else {
				return 2; // L: 1628
			}
		} else if (Interpreter.field871 >= 10) { // L: 1590
			throw new RuntimeException(); // L: 1591
		} else {
			if (var0 >= 2000) { // L: 1594
				var7 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1595
			} else {
				var7 = var2 ? class53.scriptDotWidget : Interpreter.field864; // L: 1597
			}

			if (var7.onResize == null) { // L: 1598
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1599
				var9.widget = var7; // L: 1600
				var9.args = var7.onResize; // L: 1601
				var9.field1068 = Interpreter.field871 + 1; // L: 1602
				Client.scriptEvents.addFirst(var9); // L: 1603
				return 1; // L: 1604
			}
		}
	}
}
