import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ie")
@Implements("ClientPacket")
public class ClientPacket implements class253 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2913;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2834;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2835;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2836;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2870;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2910;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2934;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2840;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2841;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2842;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2843;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2890;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2845;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2874;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2847;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2848;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2849;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2936;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	static final ClientPacket field2851;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2852;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2853;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2854;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2855;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2856;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2857;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2938;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2859;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2860;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2838;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2862;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2931;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2864;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2930;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2866;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2850;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2868;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	static final ClientPacket field2869;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2908;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2916;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2872;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	static final ClientPacket field2873;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2861;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2875;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2876;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2877;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2878;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2879;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2914;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2903;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2887;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2883;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2884;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2839;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2886;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2837;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2905;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2889;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2926;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2891;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2892;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2833;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2894;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2895;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2882;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2897;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2898;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2899;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2844;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2904;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2902;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2901;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2867;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2846;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2906;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2907;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2865;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2909;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2928;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2911;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2912;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2885;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2933;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2925;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2927;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2917;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2918;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2919;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2896;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2921;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2922;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2923;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2924;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2900;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2881;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2863;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2871;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2858;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2880;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	static final ClientPacket field2888;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2932;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2920;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2915;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2935;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2929;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	static final ClientPacket field2937;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final ClientPacket field2893;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1983972679
	)
	@Export("id")
	final int id;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 722628299
	)
	@Export("length")
	final int length;

	static {
		field2913 = new ClientPacket(0, 11);
		field2834 = new ClientPacket(1, 3);
		field2835 = new ClientPacket(2, 6);
		field2836 = new ClientPacket(3, 4);
		field2870 = new ClientPacket(4, 8);
		field2910 = new ClientPacket(5, 15);
		field2934 = new ClientPacket(6, 7);
		field2840 = new ClientPacket(7, 15);
		field2841 = new ClientPacket(8, 3);
		field2842 = new ClientPacket(9, 11);
		field2843 = new ClientPacket(10, 3);
		field2890 = new ClientPacket(11, 10);
		field2845 = new ClientPacket(12, 15);
		field2874 = new ClientPacket(13, 8);
		field2847 = new ClientPacket(14, 16);
		field2848 = new ClientPacket(15, 11);
		field2849 = new ClientPacket(16, 8);
		field2936 = new ClientPacket(17, 4);
		field2851 = new ClientPacket(18, -1);
		field2852 = new ClientPacket(19, 7);
		field2853 = new ClientPacket(20, -1);
		field2854 = new ClientPacket(21, -1);
		field2855 = new ClientPacket(22, 3);
		field2856 = new ClientPacket(23, 9);
		field2857 = new ClientPacket(24, 8);
		field2938 = new ClientPacket(25, 15);
		field2859 = new ClientPacket(26, 3);
		field2860 = new ClientPacket(27, -1);
		field2838 = new ClientPacket(28, -1);
		field2862 = new ClientPacket(29, 3);
		field2931 = new ClientPacket(30, 3);
		field2864 = new ClientPacket(31, 2);
		field2930 = new ClientPacket(32, 1);
		field2866 = new ClientPacket(33, 8);
		field2850 = new ClientPacket(34, -1);
		field2868 = new ClientPacket(35, 3);
		field2869 = new ClientPacket(36, -1);
		field2908 = new ClientPacket(37, 6);
		field2916 = new ClientPacket(38, -1);
		field2872 = new ClientPacket(39, 3);
		field2873 = new ClientPacket(40, -1);
		field2861 = new ClientPacket(41, -1);
		field2875 = new ClientPacket(42, -2);
		field2876 = new ClientPacket(43, 7);
		field2877 = new ClientPacket(44, -1);
		field2878 = new ClientPacket(45, -1);
		field2879 = new ClientPacket(46, -2);
		field2914 = new ClientPacket(47, 8);
		field2903 = new ClientPacket(48, 0);
		field2887 = new ClientPacket(49, 8);
		field2883 = new ClientPacket(50, 0);
		field2884 = new ClientPacket(51, 3);
		field2839 = new ClientPacket(52, -1);
		field2886 = new ClientPacket(53, 8);
		field2837 = new ClientPacket(54, 0);
		field2905 = new ClientPacket(55, 8);
		field2889 = new ClientPacket(56, 11);
		field2926 = new ClientPacket(57, -1);
		field2891 = new ClientPacket(58, 0);
		field2892 = new ClientPacket(59, 16);
		field2833 = new ClientPacket(60, 8);
		field2894 = new ClientPacket(61, -1);
		field2895 = new ClientPacket(62, 8);
		field2882 = new ClientPacket(63, -2);
		field2897 = new ClientPacket(64, 4);
		field2898 = new ClientPacket(65, 9);
		field2899 = new ClientPacket(66, 8);
		field2844 = new ClientPacket(67, 7);
		field2904 = new ClientPacket(68, 8);
		field2902 = new ClientPacket(69, -1);
		field2901 = new ClientPacket(70, 2);
		field2867 = new ClientPacket(71, 3);
		field2846 = new ClientPacket(72, 4);
		field2906 = new ClientPacket(73, 2);
		field2907 = new ClientPacket(74, -1);
		field2865 = new ClientPacket(75, 5);
		field2909 = new ClientPacket(76, 7);
		field2928 = new ClientPacket(77, 8);
		field2911 = new ClientPacket(78, 3);
		field2912 = new ClientPacket(79, 7);
		field2885 = new ClientPacket(80, 7);
		field2933 = new ClientPacket(81, 3);
		field2925 = new ClientPacket(82, 2);
		field2927 = new ClientPacket(83, 7);
		field2917 = new ClientPacket(84, -1);
		field2918 = new ClientPacket(85, 8);
		field2919 = new ClientPacket(86, 16);
		field2896 = new ClientPacket(87, -1);
		field2921 = new ClientPacket(88, -1);
		field2922 = new ClientPacket(89, 13);
		field2923 = new ClientPacket(90, 8);
		field2924 = new ClientPacket(91, 8);
		field2900 = new ClientPacket(92, 8);
		field2881 = new ClientPacket(93, 7);
		field2863 = new ClientPacket(94, 14);
		field2871 = new ClientPacket(95, 8);
		field2858 = new ClientPacket(96, 8);
		field2880 = new ClientPacket(97, -1);
		field2888 = new ClientPacket(98, 2);
		field2932 = new ClientPacket(99, -1);
		field2920 = new ClientPacket(100, 7);
		field2915 = new ClientPacket(101, -1);
		field2935 = new ClientPacket(102, 3);
		field2929 = new ClientPacket(103, 0);
		field2937 = new ClientPacket(104, 7);
		field2893 = new ClientPacket(105, 4);
	}

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1574749795"
	)
	public static boolean method4979(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1241675142"
	)
	static void method4977() {
		Players.Players_count = 0;

		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.field1278[var0] = null;
			Players.field1277[var0] = class185.field2135;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "1"
	)
	static int method4976(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class339.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					WorldMapLabelSize.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class424.clientPreferences.windowMode;
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--Interpreter.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5311) {
					Interpreter.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 5312) {
					--Interpreter.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					BufferedNetSocket.Interpreter_stringStackSize -= 2;
					--Interpreter.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--BufferedNetSocket.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class424.clientPreferences.windowMode = var3;
					GameEngine.savePreferences();
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	static final void method4978() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var0.plane == SoundSystem.Client_plane && !var0.isFinished) {
				if (Client.cycle >= var0.cycleStart) {
					var0.advance(Client.field566);
					if (var0.isFinished) {
						var0.remove();
					} else {
						Decimator.scene.drawEntity(var0.plane, var0.x, var0.y, var0.height, 60, var0, 0, -1L, false);
					}
				}
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-115"
	)
	static void method4975(int var0) {
		Client.oculusOrbState = var0;
	}
}
