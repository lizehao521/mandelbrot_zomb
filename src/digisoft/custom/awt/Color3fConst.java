package digisoft.custom.awt;

import digisoft.custom.NumberFunctions;

/**
 * @author Zom-B
 * @since 1.0
 * @date 2009/04/16
 */
public class Color3fConst {

    public static void main(String[] args) {
        int p = 0;
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 8; j++) {
                Color3f c = new Color3f(Color3fConst.DOS_PALETTE[p++]);
                System.out.print("0x" + NumberFunctions.toStringFixedLength(c.getRGB(), 16, 6) + ", ");
            }
            System.out.println(" //");
        }
    }
    public static final int[] DOS_PALETTE = {0x000000, 0x0000AA, 0x00AA00, 0x00AAAA, 0xAA0000, 0xAA00AA, 0xAA5500, 0xAAAAAA, //
        0x555555, 0x5555FF, 0x55FF55, 0x55FFFF, 0xFF5555, 0xFF55FF, 0xFFFF55, 0xFFFFFF, //
        0x000000, 0x141414, 0x202020, 0x2C2C2C, 0x383838, 0x454545, 0x515151, 0x616161, //
        0x717171, 0x828282, 0x929292, 0xA2A2A2, 0xB6B6B6, 0xCBCBCB, 0xE3E3E3, 0xFFFFFF, //
        0x0000FF, 0x4100FF, 0x7D00FF, 0xBE00FF, 0xFF00FF, 0xFF00BE, 0xFF007D, 0xFF0041, //
        0xFF0000, 0xFF4100, 0xFF7D00, 0xFFBE00, 0xFFFF00, 0xBEFF00, 0x7DFF00, 0x41FF00, //
        0x00FF00, 0x00FF41, 0x00FF7D, 0x00FFBE, 0x00FFFF, 0x00BEFF, 0x007DFF, 0x0041FF, //
        0x7D7DFF, 0x9E7DFF, 0xBE7DFF, 0xDF7DFF, 0xFF7DFF, 0xFF7DDF, 0xFF7DBE, 0xFF7D9E, //
        0xFF7D7D, 0xFF9E7D, 0xFFBE7D, 0xFFDF7D, 0xFFFF7D, 0xDFFF7D, 0xBEFF7D, 0x9EFF7D, //
        0x7DFF7D, 0x7DFF9E, 0x7DFFBE, 0x7DFFDF, 0x7DFFFF, 0x7DDFFF, 0x7DBEFF, 0x7D9EFF, //
        0xB6B6FF, 0xC7B6FF, 0xDBB6FF, 0xEBB6FF, 0xFFB6FF, 0xFFB6EB, 0xFFB6DB, 0xFFB6C7, //
        0xFFB6B6, 0xFFC7B6, 0xFFDBB6, 0xFFEBB6, 0xFFFFB6, 0xEBFFB6, 0xDBFFB6, 0xC7FFB6, //
        0xB6FFB6, 0xB6FFC7, 0xB6FFDB, 0xB6FFEB, 0xB6FFFF, 0xB6EBFF, 0xB6DBFF, 0xB6C7FF, //
        0x000071, 0x1C0071, 0x380071, 0x550071, 0x710071, 0x710055, 0x710038, 0x71001C, //
        0x710000, 0x711C00, 0x713800, 0x715500, 0x717100, 0x557100, 0x387100, 0x1C7100, //
        0x007100, 0x00711C, 0x007138, 0x007155, 0x007171, 0x005571, 0x003871, 0x001C71, //
        0x383871, 0x453871, 0x553871, 0x613871, 0x713871, 0x713861, 0x713855, 0x713845, //
        0x713838, 0x714538, 0x715538, 0x716138, 0x717138, 0x617138, 0x557138, 0x457138, //
        0x387138, 0x387145, 0x387155, 0x387161, 0x387171, 0x386171, 0x385571, 0x384571, //
        0x515171, 0x595171, 0x615171, 0x695171, 0x715171, 0x715169, 0x715161, 0x715159, //
        0x715151, 0x715951, 0x716151, 0x716951, 0x717151, 0x697151, 0x617151, 0x597151, //
        0x517151, 0x517159, 0x517161, 0x517169, 0x517171, 0x516971, 0x516171, 0x515971, //
        0x000041, 0x100041, 0x200041, 0x300041, 0x410041, 0x410030, 0x410020, 0x410010, //
        0x410000, 0x411000, 0x412000, 0x413000, 0x414100, 0x304100, 0x204100, 0x104100, //
        0x004100, 0x004110, 0x004120, 0x004130, 0x004141, 0x003041, 0x002041, 0x001041, //
        0x202041, 0x282041, 0x302041, 0x382041, 0x412041, 0x412038, 0x412030, 0x412028, //
        0x412020, 0x412820, 0x413020, 0x413820, 0x414120, 0x384120, 0x304120, 0x284120, //
        0x204120, 0x204128, 0x204130, 0x204138, 0x204141, 0x203841, 0x203041, 0x202841, //
        0x2C2C41, 0x302C41, 0x342C41, 0x3C2C41, 0x412C41, 0x412C3C, 0x412C34, 0x412C30, //
        0x412C2C, 0x41302C, 0x41342C, 0x413C2C, 0x41412C, 0x3C412C, 0x34412C, 0x30412C, //
        0x2C412C, 0x2C4130, 0x2C4134, 0x2C413C, 0x2C4141, 0x2C3C41, 0x2C3441, 0x2C3041, //
        0x000000, 0x000000, 0x000000, 0x000000, 0x000000, 0x000000, 0x000000, 0x000000, //
        0x000000};
    public static final Color3f[] DOS_COLORS = {new Color3f(0.0f, 0.0f, 0.0f), new Color3f(0.0f, 0.0f, 0.6666667f), //
        new Color3f(0.0f, 0.6666667f, 0.0f), new Color3f(0.0f, 0.6666667f, 0.6666667f), //
        new Color3f(0.6666667f, 0.0f, 0.0f), new Color3f(0.6666667f, 0.0f, 0.6666667f), //
        new Color3f(0.6666667f, 0.33333334f, 0.0f), new Color3f(0.6666667f, 0.6666667f, 0.6666667f), //
        new Color3f(0.33333334f, 0.33333334f, 0.33333334f), new Color3f(0.33333334f, 0.33333334f, 1.0f), //
        new Color3f(0.33333334f, 1.0f, 0.33333334f), new Color3f(0.33333334f, 1.0f, 1.0f), //
        new Color3f(1.0f, 0.33333334f, 0.33333334f), new Color3f(1.0f, 0.33333334f, 1.0f), //
        new Color3f(1.0f, 1.0f, 0.33333334f), new Color3f(1.0f, 1.0f, 1.0f), //
        new Color3f(0.0f, 0.0f, 0.0f), new Color3f(0.078431375f, 0.078431375f, 0.078431375f), //
        new Color3f(0.1254902f, 0.1254902f, 0.1254902f), new Color3f(0.17254902f, 0.17254902f, 0.17254902f), //
        new Color3f(0.21960784f, 0.21960784f, 0.21960784f), new Color3f(0.27058825f, 0.27058825f, 0.27058825f), //
        new Color3f(0.31764707f, 0.31764707f, 0.31764707f), new Color3f(0.38039216f, 0.38039216f, 0.38039216f), //
        new Color3f(0.44313726f, 0.44313726f, 0.44313726f), new Color3f(0.50980395f, 0.50980395f, 0.50980395f), //
        new Color3f(0.57254905f, 0.57254905f, 0.57254905f), new Color3f(0.63529414f, 0.63529414f, 0.63529414f), //
        new Color3f(0.7137255f, 0.7137255f, 0.7137255f), new Color3f(0.79607844f, 0.79607844f, 0.79607844f), //
        new Color3f(0.8901961f, 0.8901961f, 0.8901961f), new Color3f(1.0f, 1.0f, 1.0f), //
        new Color3f(0.0f, 0.0f, 1.0f), new Color3f(0.25490198f, 0.0f, 1.0f), //
        new Color3f(0.49019608f, 0.0f, 1.0f), new Color3f(0.74509805f, 0.0f, 1.0f), //
        new Color3f(1.0f, 0.0f, 1.0f), new Color3f(1.0f, 0.0f, 0.74509805f), //
        new Color3f(1.0f, 0.0f, 0.49019608f), new Color3f(1.0f, 0.0f, 0.25490198f), //
        new Color3f(1.0f, 0.0f, 0.0f), new Color3f(1.0f, 0.25490198f, 0.0f), //
        new Color3f(1.0f, 0.49019608f, 0.0f), new Color3f(1.0f, 0.74509805f, 0.0f), //
        new Color3f(1.0f, 1.0f, 0.0f), new Color3f(0.74509805f, 1.0f, 0.0f), //
        new Color3f(0.49019608f, 1.0f, 0.0f), new Color3f(0.25490198f, 1.0f, 0.0f), //
        new Color3f(0.0f, 1.0f, 0.0f), new Color3f(0.0f, 1.0f, 0.25490198f), //
        new Color3f(0.0f, 1.0f, 0.49019608f), new Color3f(0.0f, 1.0f, 0.74509805f), //
        new Color3f(0.0f, 1.0f, 1.0f), new Color3f(0.0f, 0.74509805f, 1.0f), //
        new Color3f(0.0f, 0.49019608f, 1.0f), new Color3f(0.0f, 0.25490198f, 1.0f), //
        new Color3f(0.49019608f, 0.49019608f, 1.0f), new Color3f(0.61960787f, 0.49019608f, 1.0f), //
        new Color3f(0.74509805f, 0.49019608f, 1.0f), new Color3f(0.8745098f, 0.49019608f, 1.0f), //
        new Color3f(1.0f, 0.49019608f, 1.0f), new Color3f(1.0f, 0.49019608f, 0.8745098f), //
        new Color3f(1.0f, 0.49019608f, 0.74509805f), new Color3f(1.0f, 0.49019608f, 0.61960787f), //
        new Color3f(1.0f, 0.49019608f, 0.49019608f), new Color3f(1.0f, 0.61960787f, 0.49019608f), //
        new Color3f(1.0f, 0.74509805f, 0.49019608f), new Color3f(1.0f, 0.8745098f, 0.49019608f), //
        new Color3f(1.0f, 1.0f, 0.49019608f), new Color3f(0.8745098f, 1.0f, 0.49019608f), //
        new Color3f(0.74509805f, 1.0f, 0.49019608f), new Color3f(0.61960787f, 1.0f, 0.49019608f), //
        new Color3f(0.49019608f, 1.0f, 0.49019608f), new Color3f(0.49019608f, 1.0f, 0.61960787f), //
        new Color3f(0.49019608f, 1.0f, 0.74509805f), new Color3f(0.49019608f, 1.0f, 0.8745098f), //
        new Color3f(0.49019608f, 1.0f, 1.0f), new Color3f(0.49019608f, 0.8745098f, 1.0f), //
        new Color3f(0.49019608f, 0.74509805f, 1.0f), new Color3f(0.49019608f, 0.61960787f, 1.0f), //
        new Color3f(0.7137255f, 0.7137255f, 1.0f), new Color3f(0.78039217f, 0.7137255f, 1.0f), //
        new Color3f(0.85882354f, 0.7137255f, 1.0f), new Color3f(0.92156863f, 0.7137255f, 1.0f), //
        new Color3f(1.0f, 0.7137255f, 1.0f), new Color3f(1.0f, 0.7137255f, 0.92156863f), //
        new Color3f(1.0f, 0.7137255f, 0.85882354f), new Color3f(1.0f, 0.7137255f, 0.78039217f), //
        new Color3f(1.0f, 0.7137255f, 0.7137255f), new Color3f(1.0f, 0.78039217f, 0.7137255f), //
        new Color3f(1.0f, 0.85882354f, 0.7137255f), new Color3f(1.0f, 0.92156863f, 0.7137255f), //
        new Color3f(1.0f, 1.0f, 0.7137255f), new Color3f(0.92156863f, 1.0f, 0.7137255f), //
        new Color3f(0.85882354f, 1.0f, 0.7137255f), new Color3f(0.78039217f, 1.0f, 0.7137255f), //
        new Color3f(0.7137255f, 1.0f, 0.7137255f), new Color3f(0.7137255f, 1.0f, 0.78039217f), //
        new Color3f(0.7137255f, 1.0f, 0.85882354f), new Color3f(0.7137255f, 1.0f, 0.92156863f), //
        new Color3f(0.7137255f, 1.0f, 1.0f), new Color3f(0.7137255f, 0.92156863f, 1.0f), //
        new Color3f(0.7137255f, 0.85882354f, 1.0f), new Color3f(0.7137255f, 0.78039217f, 1.0f), //
        new Color3f(0.0f, 0.0f, 0.44313726f), new Color3f(0.10980392f, 0.0f, 0.44313726f), //
        new Color3f(0.21960784f, 0.0f, 0.44313726f), new Color3f(0.33333334f, 0.0f, 0.44313726f), //
        new Color3f(0.44313726f, 0.0f, 0.44313726f), new Color3f(0.44313726f, 0.0f, 0.33333334f), //
        new Color3f(0.44313726f, 0.0f, 0.21960784f), new Color3f(0.44313726f, 0.0f, 0.10980392f), //
        new Color3f(0.44313726f, 0.0f, 0.0f), new Color3f(0.44313726f, 0.10980392f, 0.0f), //
        new Color3f(0.44313726f, 0.21960784f, 0.0f), new Color3f(0.44313726f, 0.33333334f, 0.0f), //
        new Color3f(0.44313726f, 0.44313726f, 0.0f), new Color3f(0.33333334f, 0.44313726f, 0.0f), //
        new Color3f(0.21960784f, 0.44313726f, 0.0f), new Color3f(0.10980392f, 0.44313726f, 0.0f), //
        new Color3f(0.0f, 0.44313726f, 0.0f), new Color3f(0.0f, 0.44313726f, 0.10980392f), //
        new Color3f(0.0f, 0.44313726f, 0.21960784f), new Color3f(0.0f, 0.44313726f, 0.33333334f), //
        new Color3f(0.0f, 0.44313726f, 0.44313726f), new Color3f(0.0f, 0.33333334f, 0.44313726f), //
        new Color3f(0.0f, 0.21960784f, 0.44313726f), new Color3f(0.0f, 0.10980392f, 0.44313726f), //
        new Color3f(0.21960784f, 0.21960784f, 0.44313726f), new Color3f(0.27058825f, 0.21960784f, 0.44313726f), //
        new Color3f(0.33333334f, 0.21960784f, 0.44313726f), new Color3f(0.38039216f, 0.21960784f, 0.44313726f), //
        new Color3f(0.44313726f, 0.21960784f, 0.44313726f), new Color3f(0.44313726f, 0.21960784f, 0.38039216f), //
        new Color3f(0.44313726f, 0.21960784f, 0.33333334f), new Color3f(0.44313726f, 0.21960784f, 0.27058825f), //
        new Color3f(0.44313726f, 0.21960784f, 0.21960784f), new Color3f(0.44313726f, 0.27058825f, 0.21960784f), //
        new Color3f(0.44313726f, 0.33333334f, 0.21960784f), new Color3f(0.44313726f, 0.38039216f, 0.21960784f), //
        new Color3f(0.44313726f, 0.44313726f, 0.21960784f), new Color3f(0.38039216f, 0.44313726f, 0.21960784f), //
        new Color3f(0.33333334f, 0.44313726f, 0.21960784f), new Color3f(0.27058825f, 0.44313726f, 0.21960784f), //
        new Color3f(0.21960784f, 0.44313726f, 0.21960784f), new Color3f(0.21960784f, 0.44313726f, 0.27058825f), //
        new Color3f(0.21960784f, 0.44313726f, 0.33333334f), new Color3f(0.21960784f, 0.44313726f, 0.38039216f), //
        new Color3f(0.21960784f, 0.44313726f, 0.44313726f), new Color3f(0.21960784f, 0.38039216f, 0.44313726f), //
        new Color3f(0.21960784f, 0.33333334f, 0.44313726f), new Color3f(0.21960784f, 0.27058825f, 0.44313726f), //
        new Color3f(0.31764707f, 0.31764707f, 0.44313726f), new Color3f(0.34901962f, 0.31764707f, 0.44313726f), //
        new Color3f(0.38039216f, 0.31764707f, 0.44313726f), new Color3f(0.4117647f, 0.31764707f, 0.44313726f), //
        new Color3f(0.44313726f, 0.31764707f, 0.44313726f), new Color3f(0.44313726f, 0.31764707f, 0.4117647f), //
        new Color3f(0.44313726f, 0.31764707f, 0.38039216f), new Color3f(0.44313726f, 0.31764707f, 0.34901962f), //
        new Color3f(0.44313726f, 0.31764707f, 0.31764707f), new Color3f(0.44313726f, 0.34901962f, 0.31764707f), //
        new Color3f(0.44313726f, 0.38039216f, 0.31764707f), new Color3f(0.44313726f, 0.4117647f, 0.31764707f), //
        new Color3f(0.44313726f, 0.44313726f, 0.31764707f), new Color3f(0.4117647f, 0.44313726f, 0.31764707f), //
        new Color3f(0.38039216f, 0.44313726f, 0.31764707f), new Color3f(0.34901962f, 0.44313726f, 0.31764707f), //
        new Color3f(0.31764707f, 0.44313726f, 0.31764707f), new Color3f(0.31764707f, 0.44313726f, 0.34901962f), //
        new Color3f(0.31764707f, 0.44313726f, 0.38039216f), new Color3f(0.31764707f, 0.44313726f, 0.4117647f), //
        new Color3f(0.31764707f, 0.44313726f, 0.44313726f), new Color3f(0.31764707f, 0.4117647f, 0.44313726f), //
        new Color3f(0.31764707f, 0.38039216f, 0.44313726f), new Color3f(0.31764707f, 0.34901962f, 0.44313726f), //
        new Color3f(0.0f, 0.0f, 0.25490198f), new Color3f(0.0627451f, 0.0f, 0.25490198f), //
        new Color3f(0.1254902f, 0.0f, 0.25490198f), new Color3f(0.1882353f, 0.0f, 0.25490198f), //
        new Color3f(0.25490198f, 0.0f, 0.25490198f), new Color3f(0.25490198f, 0.0f, 0.1882353f), //
        new Color3f(0.25490198f, 0.0f, 0.1254902f), new Color3f(0.25490198f, 0.0f, 0.0627451f), //
        new Color3f(0.25490198f, 0.0f, 0.0f), new Color3f(0.25490198f, 0.0627451f, 0.0f), //
        new Color3f(0.25490198f, 0.1254902f, 0.0f), new Color3f(0.25490198f, 0.1882353f, 0.0f), //
        new Color3f(0.25490198f, 0.25490198f, 0.0f), new Color3f(0.1882353f, 0.25490198f, 0.0f), //
        new Color3f(0.1254902f, 0.25490198f, 0.0f), new Color3f(0.0627451f, 0.25490198f, 0.0f), //
        new Color3f(0.0f, 0.25490198f, 0.0f), new Color3f(0.0f, 0.25490198f, 0.0627451f), //
        new Color3f(0.0f, 0.25490198f, 0.1254902f), new Color3f(0.0f, 0.25490198f, 0.1882353f), //
        new Color3f(0.0f, 0.25490198f, 0.25490198f), new Color3f(0.0f, 0.1882353f, 0.25490198f), //
        new Color3f(0.0f, 0.1254902f, 0.25490198f), new Color3f(0.0f, 0.0627451f, 0.25490198f), //
        new Color3f(0.1254902f, 0.1254902f, 0.25490198f), new Color3f(0.15686275f, 0.1254902f, 0.25490198f), //
        new Color3f(0.1882353f, 0.1254902f, 0.25490198f), new Color3f(0.21960784f, 0.1254902f, 0.25490198f), //
        new Color3f(0.25490198f, 0.1254902f, 0.25490198f), new Color3f(0.25490198f, 0.1254902f, 0.21960784f), //
        new Color3f(0.25490198f, 0.1254902f, 0.1882353f), new Color3f(0.25490198f, 0.1254902f, 0.15686275f), //
        new Color3f(0.25490198f, 0.1254902f, 0.1254902f), new Color3f(0.25490198f, 0.15686275f, 0.1254902f), //
        new Color3f(0.25490198f, 0.1882353f, 0.1254902f), new Color3f(0.25490198f, 0.21960784f, 0.1254902f), //
        new Color3f(0.25490198f, 0.25490198f, 0.1254902f), new Color3f(0.21960784f, 0.25490198f, 0.1254902f), //
        new Color3f(0.1882353f, 0.25490198f, 0.1254902f), new Color3f(0.15686275f, 0.25490198f, 0.1254902f), //
        new Color3f(0.1254902f, 0.25490198f, 0.1254902f), new Color3f(0.1254902f, 0.25490198f, 0.15686275f), //
        new Color3f(0.1254902f, 0.25490198f, 0.1882353f), new Color3f(0.1254902f, 0.25490198f, 0.21960784f), //
        new Color3f(0.1254902f, 0.25490198f, 0.25490198f), new Color3f(0.1254902f, 0.21960784f, 0.25490198f), //
        new Color3f(0.1254902f, 0.1882353f, 0.25490198f), new Color3f(0.1254902f, 0.15686275f, 0.25490198f), //
        new Color3f(0.17254902f, 0.17254902f, 0.25490198f), new Color3f(0.1882353f, 0.17254902f, 0.25490198f), //
        new Color3f(0.20392157f, 0.17254902f, 0.25490198f), new Color3f(0.23529412f, 0.17254902f, 0.25490198f), //
        new Color3f(0.25490198f, 0.17254902f, 0.25490198f), new Color3f(0.25490198f, 0.17254902f, 0.23529412f), //
        new Color3f(0.25490198f, 0.17254902f, 0.20392157f), new Color3f(0.25490198f, 0.17254902f, 0.1882353f), //
        new Color3f(0.25490198f, 0.17254902f, 0.17254902f), new Color3f(0.25490198f, 0.1882353f, 0.17254902f), //
        new Color3f(0.25490198f, 0.20392157f, 0.17254902f), new Color3f(0.25490198f, 0.23529412f, 0.17254902f), //
        new Color3f(0.25490198f, 0.25490198f, 0.17254902f), new Color3f(0.23529412f, 0.25490198f, 0.17254902f), //
        new Color3f(0.20392157f, 0.25490198f, 0.17254902f), new Color3f(0.1882353f, 0.25490198f, 0.17254902f), //
        new Color3f(0.17254902f, 0.25490198f, 0.17254902f), new Color3f(0.17254902f, 0.25490198f, 0.1882353f), //
        new Color3f(0.17254902f, 0.25490198f, 0.20392157f), new Color3f(0.17254902f, 0.25490198f, 0.23529412f), //
        new Color3f(0.17254902f, 0.25490198f, 0.25490198f), new Color3f(0.17254902f, 0.23529412f, 0.25490198f), //
        new Color3f(0.17254902f, 0.20392157f, 0.25490198f), new Color3f(0.17254902f, 0.1882353f, 0.25490198f), //
        new Color3f(0.0f, 0.0f, 0.0f), new Color3f(0.0f, 0.0f, 0.0f), //
        new Color3f(0.0f, 0.0f, 0.0f), new Color3f(0.0f, 0.0f, 0.0f), //
        new Color3f(0.0f, 0.0f, 0.0f), new Color3f(0.0f, 0.0f, 0.0f), //
        new Color3f(0.0f, 0.0f, 0.0f), new Color3f(0.0f, 0.0f, 0.0f), //
        new Color3f(0.0f, 0.0f, 0.0f)};
}
